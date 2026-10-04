let btn=document.querySelector("#submit");

function resizeImage(){
    let img1=document.querySelector("#image1");
    let  img2=document.querySelector("#image2");

    img1.style.height="150px";
    img1.style.weidth="150px";

    img2.style.height="150px";
    img2.style.weidth="150px";
}

btn.addEventListener("click", resizeImage);