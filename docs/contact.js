document.getElementById("contactForm")
.addEventListener("submit", async function(e){

    e.preventDefault();

    const contact = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        subject: document.getElementById("subject").value,
        message: document.getElementById("message").value
    };

    try {

        const response = await fetch(
            "https://tourism-project-production-a463.up.railway.app/contact/save",
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(contact)
            }
        );

        const result = await response.text();

        alert(result);

        document.getElementById("contactForm").reset();

    } catch(error) {

        alert("Failed to send message");

    }

});