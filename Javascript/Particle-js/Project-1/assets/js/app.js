/* -----------------------------------------------
/* How to use? : Check the GitHub README
/* ----------------------------------------------- */

/* To load a config file (particles.json) you need to host this demo (MAMP/WAMP/local)... */
/*
particlesJS.load('particles-js', 'particles.json', function() {
  console.log('particles.js loaded - callback');
});
*/

/* Otherwise just put the config content (json): */

particlesJS('particles-js',
  
  {
    "particles": {
      "number": {
        "value": 300,
        "density": {
          "enable": true,
          "value_area": 800
        }
      },
      "color": {
        "value": "#ffffff"    //Need to change
      },
      "shape": {
        "type": "circle",
        "stroke": {
          // For Border of the particle
          "width": 0,
          "color": "#000000"
        },
      },
      "opacity": {
        "value": 0.5,
        "random": false,
      },
      "size": {
        "value": 4,
        "random": true,
      },
      "line_linked": {
        "enable": true,
        "distance": 150,
        "color": "#ffffff",   //Need to change
        "opacity": 0.4,
        "width": 1
      },
      "move": {
        "enable": true,
        "speed": 3,
        "direction": "none",
        "random": false,
        "out_mode": "bounce",
      }
    },
    "interactivity": {
      "detect_on": "canvas",
      "events": {
        "onhover": {
          "enable": false,
        },
        "onclick": {
          "enable": false,
        },
        "resize": false
      },
    },
    "retina_detect": true,
  }
);
