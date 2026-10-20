function calculateASCII(){
    let p=document.querySelector("#asciivalue");

    let input=document.querySelector("#msg");

    let msg=input.value;
    let sum=0;
    let freq={};
    for(let ch of msg){
        freq[ch]=(freq[ch]||0)+1;
    }

    for(let ch in freq){
        let product=ch.charCodeAt(0)*freq[ch];
        sum+=product%5;

    }
    p.innerText="result: "+sum;
}