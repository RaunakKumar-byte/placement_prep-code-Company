let redbtn=document.querySelector("#red-btn");
let greenbtn=document.querySelector("#green-btn");
let bluebtn=document.querySelector("#blue-btn");

let colorBox=document.querySelector("#color-box");

redbtn.addEventListener("click", function(){
    colorBox.style.backgroundColor="red";

});

greenbtn.addEventListener("click", function () {
    colorBox.style.backgroundColor = "green";
});

bluebtn.addEventListener("click", function () {
    colorBox.style.backgroundColor = "blue";
});