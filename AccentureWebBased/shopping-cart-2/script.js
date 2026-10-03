let action1 = document.getElementById("action1");
let action2 = document.getElementById("action2");
let message = document.getElementById("message");

let action3=document.querySelector("#action3");

action1.addEventListener("click", function () {
    message.innerText = "Action 1 clicked";
    message.style.color="pink";
});

action2.addEventListener("click", function () {
    message.innerText = "Action 2 clicked";
        message.style.color="pink";

});

action3.addEventListener("click", function(){
    message.innerText="Next clicked";
        message.style.color="pink";

});