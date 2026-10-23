let psw=document.querySelector("#psw");
let cpsw=document.querySelector("#cpsw");

function submit(){
    let para=document.querySelector("#para");

    if(psw.value==="" || cpsw.value===""){
        para.innerText=" enter psw";
    }else if(psw.value===cpsw.value){
        para.innerText="psw  match";
    }else{
        para.innerText="wrong psw not match";
    }
}