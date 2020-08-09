function removeUserDetails() {
    const containerDiv = document.getElementById('container');
    const userlbl = document.getElementById('userLabel');  
    const userTxtBox = document.getElementById('userTextBox');
    const startBtn = document.getElementById('startBtn');

    userName = userTxtBox.value
    containerDiv.remove();
    userlbl.remove();
    userTxtBox.remove();
    startBtn.remove();

    document.body.appendChild(mainDiv);

}