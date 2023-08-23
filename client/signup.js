document.getElementById("signupButton").addEventListener("click", function() {
    const firstname = document.getElementById("firstname").value;
    const lastname = document.getElementById("lastname").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const repassword =document.getElementById("repassword").value
    console.log(firstname);
    console.log(lastname);
    console.log(email);
    console.log(password);
    console.log(repassword);

    if(password!=repassword)
    {
        alert("Re-password is not Match")
     }
     else{

    //datbasecolumanname : text box value
    const logins= {
      firstname: firstname,
      lastname:lastname,
      email: email,
      password: password,
      repassword: repassword
    }
    console.log(logins)

    const xhr = new XMLHttpRequest();
    xhr.open("POST", "http://localhost:8083/logins");
    xhr.setRequestHeader("Content-Type" , "application/json");
    xhr.setRequestHeader("Access-Control-Allow-Origin" , "*");

    xhr.onreadystatechange = () => {
      if(xhr.readyState == 4 && xhr.status == 200) {
        console.log(xhr.responseText)
      }
    }

    xhr.send( JSON.stringify(logins) );
  }
  })