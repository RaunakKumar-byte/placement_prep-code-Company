const input=document.querySelector("#id");

function calcularAscii(){
    const str=input.value;

    let freq={};
    for(let ch of str){
        freq[ch]=(freq[ch] || 0)+1;
    }
    let sum=0;
    for(let ch in freq){
        let p=(ch.charCodeAt(0)*freq[ch]);
        sum+=p;
    }
    let k=sum%5;
    document.querySelector("p").innerText=k;
}