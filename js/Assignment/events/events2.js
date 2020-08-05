for (var i = 0; i < btn.length; i++) {
    btn[i].addEventListener('click', function(e){
        document.body.style.backgroundColor = e.currentTarget.value;
        e.currentTarget.style.backgroundColor = e.currentTarget.value;
    });
}