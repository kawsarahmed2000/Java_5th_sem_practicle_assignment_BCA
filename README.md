# Java_5th_sem_practicle_assignment_BCA
Java_5th_sem_practicle_assignment_BCA

<h3>Sl. No	Name of the Experiment</h3>
1	WRITE A PROGRAM  to find the sum of any number of integers entered as command line arguments<br>
2	WRITE A PROGRAM  to find the factorial of a given number.<br>
3	WRITE A PROGRAM  to make single dimensional array by defining the array dynamically<br>
4	WRITE A PROGRAM  to use length in case of a two dimensional array<br>
5	WRITE A PROGRAM  to decimal to binary number.<br>
6	WRITE A PROGRAM  to check if number is prime or not, by taking the number as input from the keyboard<br>
7	WRITE A PROGRAM  to find the sum of any number of integers interactively, i.e., entering every number from
the keyboard, whereas the total number of integers is given as a command line argument.<br>
8	WRITE A PROGRAM  to shows working of different function of String and 
StringBufferclass like setCharat(), setLength(), append(), insert(), concat(), equal().<br>
9	WRITE A PROGRAM  to implement the concept of method overloding.<br>
10	WRITE A PROGRAM  to implement the concept of method overriding.<br>
11	WRITE A PROGRAM  to demonstrate how packages are created and imported to a 
another java program.<br>
12	WRITE A PROGRAM  to implement the concept of multiple inheritance through 
interface.<br>
13	WRITE A PROGRAM  to implement multilevel inheritance.<br>
14	WRITE A PROGRAM  to demonstrate the exception handling using at-least three 
predefine exception.<br>
15	Write A Program  to demonstrate the user define exception.<br>
16	WRITE A PROGRAM  to demonstrate the concept of runnable interfaces.<br>
17	WRITE A PROGRAM  to demonstrate the concept of multithreading<br>
18	WRITE A PROGRAM  to demonstrate the insertion operation using JDBC<br>
19	WRITE A PROGRAM  to demonstrate the view operation using JDBC <br>
20	WRITE A PROGRAM  to demonstrate the update operation using JDBC <br>
21	WRITE A PROGRAM  to demonstrate the delete operation using JDBC <br>
<br>
<br>
<a href="https://github.com/kawsarahmed2000/Java_5th_sem_practicle_assignment_BCA/blob/8c6b9ef295c08bbc78c940b5ff2549b70c5118ba/JAVA_assignment_7167.pdf"><b>Pdf for all practicle<b></a>
  
  <embed> https://github.com/kawsarahmed2000/Java_5th_sem_practicle_assignment_BCA/blob/8c6b9ef295c08bbc78c940b5ff2549b70c5118ba/JAVA_assignment_7167.pdf </embed>

  <html>
<body>
  <div>
    <button id="prev" onclick="goPrevious()">Previous</button>
    <button id="next" onclick="goNext()">Next</button>
    &nbsp; &nbsp;
    <span>Page: <span id="page_num"></span> / <span id="page_count"></span></span>
  </div>

  <div>
    <canvas id="the-canvas" style="border:1px solid black"></canvas>
  </div>

  <!-- Use latest PDF.js build from Github -->
  <script type="text/javascript" src="https://raw.github.com/mozilla/pdf.js/gh-pages/build/pdf.js"></script>
  
  <script type="text/javascript">
    //
    // NOTE: 
    // Modifying the URL below to another server will likely *NOT* work. Because of browser
    // security restrictions, we have to use a file server with special headers
    // (CORS) - most servers don't support cross-origin browser requests.
    //
    var url = 'https://github.com/kawsarahmed2000/Java_5th_sem_practicle_assignment_BCA/blob/8c6b9ef295c08bbc78c940b5ff2549b70c5118ba/JAVA_assignment_7167.pdf';

    //
    // Disable workers to avoid yet another cross-origin issue (workers need the URL of
    // the script to be loaded, and currently do not allow cross-origin scripts)
    //
    PDFJS.disableWorker = true;

    var pdfDoc = null,
        pageNum = 1,
        scale = 0.8,
        canvas = document.getElementById('the-canvas'),
        ctx = canvas.getContext('2d');

    //
    // Get page info from document, resize canvas accordingly, and render page
    //
    function renderPage(num) {
      // Using promise to fetch the page
      pdfDoc.getPage(num).then(function(page) {
        var viewport = page.getViewport(scale);
        canvas.height = viewport.height;
        canvas.width = viewport.width;

        // Render PDF page into canvas context
        var renderContext = {
          canvasContext: ctx,
          viewport: viewport
        };
        page.render(renderContext);
      });

      // Update page counters
      document.getElementById('page_num').textContent = pageNum;
      document.getElementById('page_count').textContent = pdfDoc.numPages;
    }

    //
    // Go to previous page
    //
    function goPrevious() {
      if (pageNum <= 1)
        return;
      pageNum--;
      renderPage(pageNum);
    }

    //
    // Go to next page
    //
    function goNext() {
      if (pageNum >= pdfDoc.numPages)
        return;
      pageNum++;
      renderPage(pageNum);
    }

    //
    // Asynchronously download PDF as an ArrayBuffer
    //
    PDFJS.getDocument(url).then(function getPdfHelloWorld(_pdfDoc) {
      pdfDoc = _pdfDoc;
      renderPage(pageNum);
    });
  </script>  
</body>
</html>
