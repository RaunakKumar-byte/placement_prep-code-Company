let tiger=document.querySelector("#tiger-image");
let lion=document.querySelector("#Lion-image");

tiger.addEventListener("click", function(){
    tiger.classList.toggle("clicked");
});

lion.addEventListener("click", function(){
    lion.classList.toggle("clicked");
});