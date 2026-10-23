
function chnageShape(type){
let box=document.querySelector("#box");
box.className='';
    if(type==circle){
        box.className='css-circle';
    }else if(type===square){
        box.className='css-square';
    }else if(type==='traingle'){
        box.className='css-traingle';
    }
}