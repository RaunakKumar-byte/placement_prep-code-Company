

function submitPsw(){
let psw=document.querySelector("#psw");
let cpsw=document.querySelector("#cpsw");
let p=document.querySelector("#para");

 if(psw.value==="" || cpsw.value===""){
    p.innerText="Password is not there";
}
else if(psw.value===cpsw.value){
    p.innerText="The password matched: "+psw.value;
}else if(psw.value!=cpsw.value){
    p.innerText="Differ password";
}

}