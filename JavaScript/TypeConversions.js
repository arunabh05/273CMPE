var message = document.getElementById("message");

//Addition
function add() {
	var n1 = document.getElementById("b1").value;
	var n2 = document.getElementById("b2").value;

	//Type Conversion from String to Number
	var x = parseInt(n1);
	var y = parseInt(n2);
	var z = x + y;

	document.getElementById("res").innerHTML = "Sum :" + z;
	document.getElementById("b1").innerHTML = "";
	document.getElementById("b2").innerHTML = "";

}

//Subtraction
function subtract() {
	var n1 = document.getElementById("b1").value;
	var n2 = document.getElementById("b2").value;

	//Type Conversion from String to Number
	var x = parseInt(n1);
	var y = parseInt(n2);
	var z = x - y;

	document.getElementById("res").innerHTML = "Subtraction :" + z;
	document.getElementById("b1").innerHTML = "";
	document.getElementById("b2").innerHTML = "";
}

//Multiplication
function multiply() {
	var n1 = document.getElementById("b1").value;
	var n2 = document.getElementById("b2").value;

	//Type Conversion from String to Number
	var x = parseInt(n1);
	var y = parseInt(n2);
	var z = x * y;

	document.getElementById("res").innerHTML = "Multiplication :" + z;
	document.getElementById("b1").innerHTML = "";
	document.getElementById("b2").innerHTML = "";
}


//Division
function divide() {
	var n1 = document.getElementById("b1").value;
	var n2 = document.getElementById("b2").value;

	//Type Conversion from String to Number
	var x = parseInt(n1);
	var y = parseInt(n2);

	//Check for Errors
	try {
		if (y == 0) {
			throw "cannot divide by zero"
		} else
			var z = x / y;

		document.getElementById("res").innerHTML = "Division :" + z;
		document.getElementById("b1").innerHTML = "";
		document.getElementById("b2").innerHTML = "";
	} catch (err) {
		message.innerHTML = "Error : " + err + ".";
	}

}