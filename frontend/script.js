document.getElementById("loginForm")
.addEventListener("submit", async function(e){

    e.preventDefault();
   
    const username =
        document.querySelector("input[type=text]").value;

    const password =
        document.querySelector("input[type=password]").value;

    try {

        const response = await fetch(
            "http://localhost:8080/Login/register",
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({
                    username: username,
                    password: password
                })
            }
        );

        const result = await response.text();
        alert(result);

    } catch(error) {
        console.error(error);
        alert("Connection Failed");
    }
    gsap.from(".card",{
    y:200,
    opacity:0,
    duration:1.5,
    stagger:0.2
});

gsap.to(".card",{
    rotationY:20,
    duration:2,
    repeat:-1,
    yoyo:true,
    stagger:0.2
});
const cards = document.querySelectorAll(".card");

cards.forEach((card,index)=>{

    card.animate(
        [
            {transform:"translateY(0px)"},
            {transform:"translateY(-20px)"},
            {transform:"translateY(0px)"}
        ],
        {
            duration:2000 + index*500,
            iterations:Infinity
        }
    );

});
});