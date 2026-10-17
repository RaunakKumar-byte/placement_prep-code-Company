
const quotes=[
    "Belive in Yourself.",
    "Once a king always a king",
    "hgf bh ja hhx hsxb hsx.",
    "jsn jjs jsn jssn jn."
]

function QuoateGenerator(){
    let para=document.querySelector("#quote");

    const RandomIndex=Math.floor(Math.random()*quotes.length);

    para.innerText=`"${quotes[RandomIndex]}"`;

}