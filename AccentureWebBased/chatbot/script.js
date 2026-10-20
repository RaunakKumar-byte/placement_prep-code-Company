function sendMessage(){
    const inputEl=document.getElementById("userInput");
    const msgText=inputEl.value.trim();

    if(msgText==="")return;

    appendMessage(msgText,"user-message");
    inputEl.value="";

    setTimeout(()=>{
        const botReply="Thanks for reaching out! You said: \""+msgTxt+"\"";
        appendMessage(botReply,"bot-message");
    },500);
}