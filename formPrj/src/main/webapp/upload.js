document.addEventListener('DOMContentLoaded', function() {
	let tbl = document.querySelector('#show table');
	let capt = document.createElement('caption');
	capt.innerHTML = '회원리스트';
	tbl.append(capt);
	// 리스트 출력.
	let ajax = new XMLHttpRequest();
	ajax.open('get', 'member?cmd=list');
	ajax.send();
	ajax.onload = function() {
		let data = JSON.parse(this.responseText)

		let tbody = document.querySelector('#show tbody');
		data.forEach(member => {
			tbody.append(makeTr(member));
		})
	}
	//form  기본 기능 => ajax 처리 (XMLHttpRequest, fetch)
	document.forms.memberFrm.addEventListener("submit", function(e) {
		e.preventDefault();
		let formData = new FormData(e.target); //e.target=form
		for (let ent of formData.entries()) {
			console.log(ent);
		};


		//get:url ,post:추가정보지정
		fetch('memberUpload', {
			method: 'post',
			body: formData,
		})
			.then(function(result) {
				return result.json();
			})
			.then(function(result) {
				console.log(result);
			})
			.catch(function(err) {
				console.error(err);
			})



	});



});

let fields = ['membNo', 'membName', 'membPhone', 'membAddr', 'membBirth', 'membImage'];

// 회원정보 => tr 생성.
function makeTr(member) {
	let tr = document.createElement('tr');
	tr.setAttribute('id', member.membNo); // tr의 attribute중에 id를 활용.
	// tr.addEventListener('click', showDetail);
	fields.forEach(field => {
		let td = document.createElement('td');
		// null, 0, undefined, '' => false 이외 true;
		td.innerHTML = member[field] ?
			(field == 'membImage' ? '<img width="60px" src="images/' + member[field] + '">' : member[field]) : '';
		//td.innerHTML = member[field] ? member[field] : '';
		tr.append(td);
	})
	// 삭제버튼.
	let btn = document.createElement('button');
	btn.innerHTML = '삭제';
	//btn.addEventListener('click', rowDelete, false); // bubble, capture
	let td = document.createElement('td');
	td.append(btn);
	tr.append(td);
	// 체크박스. input type='checkbox'
	let chk = document.createElement('input');
	chk.setAttribute('type', 'checkbox');
	td = document.createElement('td');
	td.append(chk);
	tr.append(td);

	return tr;
}
