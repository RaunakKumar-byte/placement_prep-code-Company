
function claculatorAscii(){
let s=document.querySelector("#input").value;
let freq={};
for(let ch of s){
    freq[ch]=(freq[ch] || 0)+1;
}
 
let sum=0;

for(let ch in freq){
    let product=ch.charCodeAt(0)*freq[ch];
    sum+=product%5;
}
    document.querySelector("#result").innerText="result: "+sum;

}