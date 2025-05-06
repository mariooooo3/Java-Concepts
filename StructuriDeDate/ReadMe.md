# Structuri de Date: Stive și Cozi

## Stive (STIVE)

### Utilizare:
- **Inversarea unei secvențe**: Poate fi un cuvânt, numere, etc.
- **Verificare palindrom**: Determină dacă un cuvânt este palindrom.
- **Mecanismul de "undo"**: Modificările sunt păstrate într-o stivă.
- **Algoritmi de backtracking**: Explorarea spațiului soluțiilor.
  - Exemplu: Găsirea drumului într-un labirint – variantele de explorare se stochează într-o stivă.

---

## TAD Coadă

### Exemple de utilizare:
- **Playlist**: Redare în ordinea adăugării.
- **Rețele de comunicații**: Mesajele sunt gestionate în cozi.
- **Coadă de imprimantă**: Comenzile de tipărire sunt gestionate FIFO.
- **Portal Web**: Comenzile clienților sunt procesate în ordinea primirii.

### Situații speciale:
- Principiul FIFO poate fi încălcat în anumite cazuri, cum ar fi:
  - Cereri de întreruperi către sistemul de operare.
  - Modelarea persoanelor cu nevoi speciale care "sar" peste coadă.
  
  *Soluție:* **Coada de priorități** (de discutat ulterior).

---

## Concluzie
# 📊 LinkedList vs ArrayList

## 🥇 Best Choices:
- **Stivă (Stack)** → `ArrayList`  
  - `push/pop`: O(1)  
  - +Cache friendly  

- **Coadă (Queue)** → `LinkedList`  
  - `enqueue/dequeue`: O(1)  
  - +Operații rapide ambele capete  

## ⚠️ Avoid:
- `ArrayList` pentru cozi (remove(0) e O(n))  
- `LinkedList` pentru acces aleator (get(i) e O(n))  

## 💡 Best Alternative:
`ArrayDeque` - bun atât pentru stive cât și cozi
