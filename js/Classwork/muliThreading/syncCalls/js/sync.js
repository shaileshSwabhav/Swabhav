for (let i = 0; i < btn.length; i++) {

    btn[i].addEventListener('click', function(e) {
        if(e.target.innerHTML == "Display Time") {
            while (true) {
                const date = new Date();
                console.log(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
            }
        } else {
            console.log('Hello');
        }

    });
    
}
