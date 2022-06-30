$(document).ready(function() {

	$.ajax({
		url: 'member',
		data: 'cmd=list',
		method: 'get',
		dataType: 'json',
		success: showList,
		error: function(err) {
			console.error(err);
		}
	});

	//추가
	$('form[name="memberFrm"]').on('submit', memberAddCallBack);


});


function memberAddCallBack(e) {
	e.preventDefault();
	let fData = new FormData(e.target);
	//ajax => 데이터 등록, 화면 구현 추가
	$.ajax({
		url: 'memberUpload',
		data: fData,
		method: 'post',
		contentType: false,
		processData: false,
		success: function(result) {
			console.log(result);
		},
		error: function(err) {
			console.error(err);
		}
	})


}


function showList(result) {
	let tbody = $('#show > table > tbody');
	$(result).each(function(idx, elem) {
		tbody.append(makeTr(elem));
	});
}


function makeTr(elem) {
	//null 0 '' undefined false
	let imgSrc = elem.membImage ? '<img width="50px" src="images/' + elem.membImage + '">' : '';
	let btn = $('<button />').text('삭제');
	btn.on('click', removeCallBack);
	return $('<tr />').attr('id', elem.membNo)
		.append($('<td />').text(elem.membNo),
			$('<td />').text(elem.membName),
			$('<td />').text(elem.membPhone),
			$('<td />').text(elem.membAddr),
			$('<td />').text(elem.membBirth),
			$('<td />').html(imgSrc),
			$('<td />').append(btn),
			$('<td />').append($('<input type = checkbox>'))
		)
}

function removeCallBack(e) { //이벤트 비동기 호출
	let membNo = $(e.target).parent().parent().attr('id');
	$.ajax({
		url: 'member',
		method: 'post',
		data: 'cmd=remove&delNo=' + membNo,
		success: function(result) {
			if (result.retCode == 'Success') {
				$('#' + membNo).remove();
			} else {
				alert('처리중 에러');
			};
		},
		error: function(err) {
			console.error(err);
		}
	});
};



