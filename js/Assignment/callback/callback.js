var btn = document.querySelector("#hidden");

btn.onclick = function () {
    hidePara();
}

function hidePara() {
    var para = document.querySelector("#hidePara");
    if (para.style.display == "none") {
        para.style.display = 'block';
    } else {
        para.style.display = 'none';
    }

}
