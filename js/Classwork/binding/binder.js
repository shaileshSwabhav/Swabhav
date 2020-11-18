// const name = document.getElementById('name');
// var size = document.getElementById('size');
// const bgColor = document.getElementById('bgColor');
// const fgColor = document.getElementById('fgColor');

// const para = document.createElement('p');
// document.body.appendChild(para);
// const spanResult = document.createElement('span');
// spanResult.setAttribute('id', 'result');
// para.appendChild(spanResult);

// function updateData() {
//     spanResult.innerHTML = name.value;
//     spanResult.style.fontSize = size.value + "px";
//     spanResult.style.backgroundColor = bgColor.value;
//     spanResult.style.color = fgColor.value;
//     console.log(size.value);

// }


const name=document.getElementById("name");var size=document.getElementById("size");const bgColor=document.getElementById("bgColor"),fgColor=document.getElementById("fgColor"),para=document.createElement("p");document.body.appendChild(para);const spanResult=document.createElement("span");function updateData(){spanResult.innerHTML=name.value,spanResult.style.fontSize=size.value+"px",spanResult.style.backgroundColor=bgColor.value,spanResult.style.color=fgColor.value,console.log(size.value)}spanResult.setAttribute("id","result"),para.appendChild(spanResult);
