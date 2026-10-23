
function AsciiCalculator(){
    let inputValue=document.querySelector("#inputStr").value;

    let freq={};
    for(let ch of inputValue){
        freq[ch]=(freq[ch]||0)+1;
    }
    let sum=0;
    for( let ch in freq){
        let product=ch.charCodeAt(0)*freq[ch];
        sum+=product%5;
    }
    document.querySelector("#asciivalue").innerText="result: "+sum;
}