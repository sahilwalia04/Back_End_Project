document.getElementById("log").addEventListener("click", function() {
    const password = document.getElementById("password").value;
    const email = document.getElementById("email").value;
    console.log(email);
    console.log(password);
    let p = fetch("http://localhost:8083/logins");
    p.then((value1) => {
        return value1.json();
    }).then((value2) => {
        console.log(value2);
        const user = value2;
        const useremail = user.map((user) => user.email);
        const userpassword = user.map((user) => user.password);
        var sum = 0, num = 0;
        for (var i = 0; i < useremail.length; i++) {
            if (email === useremail[i]) {
                sum = sum + 1;
            }
            if (password === userpassword[i]) {
                num = num + 1;
            }
        }
        if (sum !== 1) {
            alert("This ID Account is not registered. Please sign up first.");
        } else if (num !== 1) {
            alert("Incorrect Password");
        } else {
            // If email and password are correct, navigate to a new page
            window.location.href = "https://sahilwalia04.github.io/Weather/"; // Change the URL to the desired page
        }
    });
}); 


// Get references to the password input and the toggle button
const passwordInput = document.getElementById('password');
const togglePasswordButton = document.getElementById('togglePassword');

// Add click event listener to the toggle button
togglePasswordButton.addEventListener('click', function () {
    // Toggle the password input type between "password" and "text"
    if (passwordInput.type === 'password') {
        passwordInput.type = 'text';
        togglePasswordButton.classList.add('show-password');
    } else {
        passwordInput.type = 'password';
        togglePasswordButton.classList.remove('show-password');
    }
});