function display() {
    DispWin = window.open('','NewWin', 'toolbar=no,status=no,width=300,height=200')
    message = "<ul><li><b>FIRST NAME: </b>" + document.form1.fname.value;
    message += "<li><b>LAST NAME: </b>" + document.form1.lname.value;
    message += "<li><b>GENDER: </b>" + document.form2.gender.value;
    message += "<li><b>AGE: </b>" + document.form2.age.value;"</ul>";
    DispWin.document.write(message);
  }
