//To validate Email and Password for defined pattern
function validateLoginDetails() {

	var userid = window.document.getElementById("userid").value;
	var password = window.document.getElementById("pass").value;

	console.log(userid);
	console.log(password);

	if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(userid)) {
		
	} else {
		document.getElementById("message").innerHTML ="invalid Email pattern";
	}

	if (/^(\w{5,8})+$/.test(password)) {

	} else {
		document.getElementById("message2").innerHTML ="invalid password pattern";
	}
}