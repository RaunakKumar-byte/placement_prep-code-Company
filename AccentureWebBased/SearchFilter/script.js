
const searchInput = document.querySelector("#search-input");
const productList = document.querySelectorAll(".product li");

// Function to filter products
function filterProducts() {
    const filterValue = searchInput.value.toLowerCase();

    productList.forEach(item => {
        const dataName = item.getAttribute("data-name").toLowerCase();

        if (dataName.includes(filterValue)) {  
            item.style.display = "";
        } else {
            item.style.display = "none";
        }
    });
}

// Set initial search value
searchInput.value = "nana";

// Filter products
filterProducts();

// Filter whenever the user types
searchInput.addEventListener("input", filterProducts);
