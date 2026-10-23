function sendMessage(){
    const inputEl=document.querySelector("#userInput");
    const msg=inputEl.value.trim();
    if(msg===""){
        return;
    }
    appendMessage(msg, "user-message");
    inputEl.value="";

    setTimeout(()=>{
        const botReply="Thanks for Reaching out! You said: \""+msg+"\"";
        appendMessage(botReply,"bot-message");
    }, 500);
}