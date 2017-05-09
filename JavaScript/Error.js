
function accBal() {
	var accNum = document.getElementById("accNo").value;
	var pinNo = document.getElementById("pin").value;
	var message = document.getElementById("message");

	//To Check User Details
	try {
		if (accNum == "")
			throw "Invalid input. Please enter a number";
		if (isNaN(accNum))
			throw "Invalid input. Please enter a number";
		if (!(accNum == "123123123"))
			throw "Invalid input. Account Number does not exist";
		if (isNaN(pinNo))
			throw "Invalid input. Please enter a number";
		if (pinNo.length > 4)
			throw "Invalid input. Please enter a 4 digit Pin";
		if (!(pinNo) == "1421")
			throw "Invalid PIN number";
		if ((accNum == "123123123") && (pinNo = "1421")) {
			document.getElementById("message").innerHTML = "";
			alert("Balance : $1512");
		}
	} catch (err) {
		message.innerHTML = "Error :" + err + ".";
	} finally {
		document.getElementById("accNo").value = "";
		document.getElementById("pin").value = "";
	}
}
