
document.getElementById("registerForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const booking = {
        name: document.getElementById("name").value,
        age: document.getElementById("age").value,
        mobile: document.getElementById("mobile").value,
        email: document.getElementById("email").value,
        place: document.getElementById("place").value,
        members: document.getElementById("members").value,
        travelDate: document.getElementById("travelDate").value
    };

    const response = await fetch(
        "http://localhost:8080/travel/book",
        {
            method:"POST",
            headers:{
                "Content-Type":"application/json"
            },
            body:JSON.stringify(booking)
        }
    );

    const result = await response.text();

    alert(result);
});