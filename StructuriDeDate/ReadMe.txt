STIVE
Utilizare:
• Inversarea unei secvențe (cuvânt, numere, etc.)
• Verificare dacă un cuvânt este palindrom
• Mecanismul de “undo” (modificările sunt păstrate într-o stivă)
• În algoritmi de tip backtracking (explorarea spațiului soluțiilor):
• ex. Găsirea drumului într-un labirint – variantele de explorare se stochează
într-o stivă


TAD Coadă
Exemple de utilizare a cozilor:
• Playlist
• Cozi mesaje intr-o retea de comunicatii
• Comenzile de tipărire în coada de aşteptare a imprimantei
• Comenzile clienţilor pe un portal Web
Există situații speciale în care principiul FIFO este încălcat (de pildă cererile de
întreruperi către sistemul de operare, sau modelarea cazului în care o persoană cu
nevoi speciale ”sare” peste coadă) -> Coada de priorități pe care o vom dicuta peste
câteva săptamâni.

Concluzie:
Așadar, LinkedList este în general mai eficient pentru cozi și stive, în special pentru operațiile de eliminare (pop și dequeue)