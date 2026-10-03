function setRating(rating) {

    let stars = document.querySelectorAll(".star");

    stars.forEach(function(star, index) {

        if (index < rating) {
            star.classList.add("filled");
        } else {
            star.classList.remove("filled");
        }

    });

    document.getElementById("rating-display").innerText =
        "Rating: " + rating;
}