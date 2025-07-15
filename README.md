# DFA Simülatörü (Deterministic Finite Automaton Simulator)

Bu proje, farklı dilleri tanıyan Deterministik Sonlu Otomata (DFA) simülatörlerini içerir. Her simülatör, belirli bir dil kuralını kontrol eder ve girilen dizgeyi kabul edip etmediğini renkli çıktılarla gösterir.

## 📋 İçerik

Proje 4 farklı DFA simülatörü içerir:

### 1. DFAsimulator.java - Dil K: "AB İÇERİR"
- **Dil Tanımı**: Girilen dizge içinde "ab" alt dizgesini içeren diller
- **Alfabe**: {a, b}
- **Durumlar**: q0, q1, q2
- **Başlangıç Durumu**: q0
- **Kabul Durumu**: q2

### 2. dilAdfa.java - Dil A: "Ardışık İki AA İçermez"
- **Dil Tanımı**: a ve b harflerinden oluşur, ardışık iki "aa" içermez
- **Alfabe**: {a, b}
- **Durumlar**: q0, q1, q2
- **Başlangıç Durumu**: q0
- **Kabul Durumları**: q0, q1

### 3. dilBdfa.java - Dil B: "Boş veya A ile Başlayıp B ile Biter"
- **Dil Tanımı**: Boş dizge veya a ile başlayıp b ile biten dizgeler
- **Alfabe**: {a, b}
- **Durumlar**: q0, q1, q2
- **Başlangıç Durumu**: q0
- **Kabul Durumları**: q0, q2

### 4. dilCdfa.java - Dil C: "En Az İki A ve İki B İçerir"
- **Dil Tanımı**: En az iki a ve iki b harfi içeren dizgeler
- **Alfabe**: {a, b}
- **Durumlar**: q0, q1, q2, q3, q4, q5, q6
- **Başlangıç Durumu**: q0
- **Kabul Durumu**: q6

## 🎯 Özellikler

- **Renkli Çıktı**: Durum geçişleri renkli olarak gösterilir
- **Hata Kontrolü**: Geçersiz semboller için hata mesajları
- **Detaylı Çıktı**: Her adımda durum geçişi görülür
- **Kullanıcı Dostu**: Türkçe mesajlar ve açık arayüz

## 🚀 Kullanım

Her simülatörü ayrı ayrı çalıştırabilirsiniz:

```bash
# Dil K (AB içerir)
javac DFAsimulator.java
java DFAsimulator

# Dil A (Ardışık AA içermez)
javac dilAdfa.java
java dilAdfa

# Dil B (Boş veya A ile başlayıp B ile biter)
javac dilBdfa.java
java dilBdfa

# Dil C (En az iki A ve iki B içerir)
javac dilCdfa.java
java dilCdfa
```

## 📊 DFA Diagramları

### Dil K - AB İÇERİR
```
q0 --a--> q1 --b--> q2 (KABUL)
|         |         |
b         a         a,b
|         |         |
v         v         v
q0        q1        q2
```

### Dil A - ARDIŞIK AA İÇERMEZ
```
q0 --a--> q1 --a--> q2 (RED)
|         |         |
b         b         a,b
|         |         |
v         v         v
q0        q0        q2
```

### Dil B - BOŞ VEYA A İLE BAŞLAYIP B İLE BİTER
```
q0 --a--> q1 --b--> q2 (KABUL)
|         |         |
b         a         a,b
|         |         |
v         v         v
q0        q1        q2
```

### Dil C - EN AZ İKİ A VE İKİ B İÇERİR
```
Karmaşık 7 durumlu DFA - q6 kabul durumu
```

## 🔧 Gereksinimler

- Java 8 veya üzeri
- Terminal/Command Prompt (renkli çıktı için)

## 🎨 Çıktı Formatı

Program şu renk kodlarını kullanır:
- **Mavi**: Durumlar
- **Kırmızı**: Semboller
- **Yeşil**: Kabul mesajları
- **Kırmızı**: Red mesajları

## 📝 Örnek Çalıştırma


Dil K: AB İÇERİR 
Dizgeyi girin: aab

baslangic durumu : q0
kabul durumu : [q2]
alfabe: [a, b]
gecis fonksiyonu: {q0={a=q1, b=q0}, q1={a=q1, b=q2}, q2={a=q2, b=q2}}

q0 ----> a ----> q1
q1 ----> a ----> q1
q1 ----> b ----> q2
Dizge kabul edildi!
```

## 🤝 Katkıda Bulunma

Bu proje eğitim amaçlıdır. Önerileriniz ve geliştirmeleriniz için pull request gönderebilirsiniz.

---

**Not**: Bu simülatörler, Biçimsel Diller ve Otomata Teorisi dersi kapsamında geliştirilmiştir.
