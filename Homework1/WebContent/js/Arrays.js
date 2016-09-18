var a = [ "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" ];
console.log(a.length);

//Inserting values in a HTML list using JavaScript Objects
for (i = 0; i < a.length; i++) {
	console.log(i);
	document.getElementById("" + i + "").innerHTML = "" + a[i];

}

//On Submission
function Sub() {
	alert("Data sucessfully stored.");
	document.getElementById("name").value = "";
	document.getElementById("mob").value = "";
	document.getElementById("add").value = "";
}
