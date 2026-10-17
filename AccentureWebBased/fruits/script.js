
function ShowFruit(){
    let fruits=document.querySelector("#fruitDropdown").value;

    let para=document.querySelector("#selectedFruit");

    para.innerText=fruits;
}