(function () {
  // Add event listener
  document.addEventListener("mousemove", parallax);
  // La MAGIA Ocurre Aqui
  // La variable e guarda las todas las propiedades del addEventListener("mousemove")
  function parallax(e) {
    // Guardar en variables la anchura y la altura de la ventana
    let _w = window.innerWidth / 2;
    let _h = window.innerHeight / 2;
    //Guardar el atributo "clientX" y "clientY" del addEventListener("mousemove")
    let _mouseX = e.clientX;
    let _mouseY = e.clientY;
    // Hacemos que se restten para que se adapte a la ventana
    let x = ((_mouseX - _w));
    let y = ((_mouseY - _h));
    // console log para averiguar la salida
    console.log("with ", _w + " heigth ", _h)
    //He añadido capas de profundidad para no haces mas lineas de las devidas
    // lo que hacen es que en la variable guarden lo que se añadira en el css .style.transform.(.......)
    // lo que aremos sera dividir por otro numero para que las imagenes en este caso no sigan 100% al raton
    let _depth1 = `translate3d(${x * (4 / 100)}px,${y * (2 / 100)}px,0px)`;
    let _depth2 = `translate3d(${x * (5 / 180)}px,${y * (1 / 180)}px,0px)`;
    let _depth3 = `translate3d(${x * (4 / 160)}px,${y * (1 / 160)}px,0px)`;
    let _depth4 = `translate3d(${x * (3 / 140)}px,${y * (1 / 140)}px,0px)`;
    let _depth5 = `translate3d(${x * (2 / 120)}px,${y * (1 / 120)}px,0px)`;
    let _depth6 = `translate3d(${x * (1 / 80)}px,${y * (1 / 80)}px,0px)`;

    // Aqui preparamos la salida final de los id's para que cambien el parametro transform de cada uno de style
    document.getElementById("HumoFondo").style.transform = `translate3d(0px,${y * (2 / 100)}px,0px)`;
    document.getElementById("Humo").style.transform = `translate3d(0px,${y * (1 / 160)}px,0px)`;
    document.getElementById("llamasP").style.transform = _depth1;
    document.getElementById("ParedFondo").style.transform = `translate3d(0px,${y * (1 / 180)}px,0px)`;
    document.getElementById("FondoPared").style.transform = _depth2;
    document.getElementById("llama2").style.transform = _depth3;
    document.getElementById("PerroSentado").style.transform = _depth4;
    document.getElementById("mesa").style.transform = _depth4;
    document.getElementById("llama1").style.transform = _depth5;
    document.getElementById("llama3").style.transform = _depth5;
    document.getElementById("BurbujaT").style.transform = `translate3d(${x * (1 / 80)}px,${y * (1 / 140)}px,0px)`;

  }

})();