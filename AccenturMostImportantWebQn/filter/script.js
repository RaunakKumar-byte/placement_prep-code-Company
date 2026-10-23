const searchInput=document.querySelector("#search-input");
const productList=document.querySelectorAll(".product li");

searchInput.value="nana";

function filterProducts(){

    const filterValue=searchInput.value.toLowerCase();

    productList.forEach(item=>{
        const dn=item.getAttribute("data-name").toLowerCase();

        if(dn.includes(filterValue)){
            item.style.display="";
        }else{
            item.style.display="none";
        }
    })
}

filterProducts();

searchInput.addEventListener('input',filterProducts);