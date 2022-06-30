
$(document).ready(function() {

	$.ajax({
		url: 'member',
		data: 'cmd=list',
		method: 'get',
		dataType: 'json',
		success: function(result) {
			console.log(result);
			let tbody = $('#show > table > tbody');

			$(result).each(function(idx, elem) {
				let btn = $('<button />').text('삭제');
				btn.on('click', function() { //이벤트 비동기 호출
					$.ajax({
						url: 'member',
						method: 'post',
						data: 'cmd=remove&delNo=' + elem.membNo,
						success: function(result) {
							if (result.retCode == 'Success') {
								$('#' + elem.membNo).remove();
							} else {
								alert('처리중 에러');
							};
						},
						error: function(err) {
							console.error(err);
						}
					});
				});

				tbody.append(
					$('<tr />').attr('id', elem.membNo)
						.append(
							$('<td />').text(elem.membNo),
							$('<td />').text(elem.membName),
							$('<td />').text(elem.membPhone),
							$('<td />').text(elem.membAddr),
							$('<td />').text(elem.membBirth),
							$('<td />').html('<img width="50px" src="images/' + elem.membImage + '">'),
							$('<td />').append(btn),
							$('<td />').append($('<input type = checkbox>'))
						)
				)
			});
		},
		error: function(err) {
			console.error(err);

		}








	});


});