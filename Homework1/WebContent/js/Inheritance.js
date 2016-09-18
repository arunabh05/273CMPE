//User Input
var id = window.prompt("ID Number");
var Person = function() {
	this.name = "Person";
}

//Base Object Type - Person
Person.prototype.print = function() {
	var pid = "" + id;
	document.getElementById("d1").innerHTML = "ID :" + pid;
}

var a = new Person();
a.print;

var inheritsFrom = function(child, parent) {
	child.prototype = Object.create(parent.prototype);
};

//Derived Object Type
var Student = function() {
	this.occupation = "Student"
	this.id = "S" + id;
}

//inheritance
inheritsFrom(Student, Person);
Student.prototype.print = function() {
	Person.prototype.print.call(this);

	document.getElementById("d2").innerHTML = "Occupation : " + this.occupation;
	document.getElementById("d3").innerHTML = "Student ID :" + id;
	console.log("Occupation :" + this.occupation);
	console.log("Student ID :" + this.id);
}


console.log(id);
if (100 > id) {
	var s = new Student();
	s.print();
} else {
	document.getElementById("d2").innerHTML = "Person ID : " + id;
	document.write("NO data available with given details");
}