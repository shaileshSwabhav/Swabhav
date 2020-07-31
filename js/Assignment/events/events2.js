for (var i = 0; i < btn.length; i++) {
    if(document.addEventListener) {
        btn[i].addEventListener("click", function(e) {
            document.body.style.backgroundColor = e.currentTarget.value;
        });
    }
}