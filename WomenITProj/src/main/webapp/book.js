document.addEventListener('DOMContentLoaded', function() {

	//리스트
	let ajax = new XMLHttpRequest();
	ajax.open('get', 'bookServ?cmd=list');
	ajax.send();
	ajax.onload = function() {
		let data = JSON.parse(this.responseText)
		let tbody = document.querySelector('#tb tbody');
		data.forEach(book => {
			tbody.append(makeTr(book));
		})
	}
});

let fields = ['bookCode', 'bookName', 'bookWriter', 'bookPublisher', 'bookPrice'];

function makeTr(book) {
	let tr = document.createElement('tr');
	tr.setAttribute('id', book.bookCode);
	// 체크박스
	let chk = document.createElement('input');
	chk.setAttribute('type', 'checkbox');
	let td = document.createElement('td');
	td.append(chk);
	tr.append(td);
	// book 정보
	fields.forEach(field => {
		let td = document.createElement('td');
		td.innerHTML = book[field];
		tr.append(td);
	})
	// 삭제버튼
	let btn = document.createElement('button');
	btn.innerHTML = '삭제';
	btn.addEventListener('click', rowDelete, false);
	td = document.createElement('td');
	td.append(btn);
	tr.append(td);
	return tr;
}


//저장
document.forms.bookFrm.addEventListener("submit", addBook)
function addBook(e) {
	e.preventDefault();
	let bCd = this.bookCode.value;
	let bNm = this.bookName.value;
	let bWt = this.bookWriter.value;
	let bPs = this.bookPublisher.value;
	let bPc = this.bookPrice.value;
	let xhtp = new XMLHttpRequest();
	xhtp.open('post', 'bookServ');
	xhtp.setRequestHeader('Content-type',
		'application/x-www-form-urlencoded');
	xhtp.send(`code=${bCd}&name=${bNm}&auth=${bWt}&pres=${bPs}&amt=${bPc}&cmd=insert`);
	xhtp.onload = function() {
		let result = JSON.parse(this.responseText);
		document.querySelector('#tb tbody').append(makeTr(result));
	}
}

//한줄삭제
function rowDelete() {
	let delCode = this.parentElement.parentElement.getAttribute('id');
	let delAjax = new XMLHttpRequest();
	delAjax.open('post', 'bookServ');
	delAjax.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	delAjax.send(`cmd=delete&delCode=${delCode}`);
	delAjax.onload = function() {
		let result = JSON.parse(delAjax.responseText);
		if (result.retCode == 'Success') {
			document.getElementById(delCode).remove();
		} else {
			alert('에러발생');
		}
	}
}

//선택삭제
document.getElementById('deleteSel').addEventListener('click', deleteSelected);
function deleteSelected() {
	let checkAll = document.querySelectorAll('table > tbody > tr > td > input:checked');
	checkAll.forEach(elem => {
		let delCode = elem.parentElement.parentElement.getAttribute('id');
		let delAjax = new XMLHttpRequest();
		delAjax.open('post', 'bookServ');
		delAjax.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
		delAjax.send(`cmd=delete&delCode=${delCode}`);
		delAjax.onload = function() {
			let result = JSON.parse(delAjax.responseText);
			if (result.retCode == 'Success') {
				document.getElementById(delCode).remove();
			} else {
				alert('에러발생');
			}
		}
	});
}