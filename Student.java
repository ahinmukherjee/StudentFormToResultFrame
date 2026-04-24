String course = (String) comboBox.getSelectedItem();

        // 👉 CALL RESULT FRAME HERE
        new ResultFrame(name, date, email, phone, course);
    }
}

// 👇 ADD THIS AT THE END OF FILE
class ResultFrame extends JFrame {

    ResultFrame(String name, String age, String email, String phone, String course) {

        setTitle("Result");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5,1));

        add(new JLabel("Name: " + name));
        add(new JLabel("Age: " + age));
        add(new JLabel("Email: " + email));
        add(new JLabel("Phone: " + phone));
        add(new JLabel("Course: " + course));

        setVisible(true);
    }
}


student-form-resultframe-project
A simple Core Java Swing application for student form input with validation and result display in a separate frame.

An interactive Java Swing project that implements a student data entry form with validation logic and dynamically displays the verified information in a separate result frame.

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Music UI</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<div class="music-app">

    <div class="header">
        <h2>Now Playing</h2>
    </div>

    <div class="album">
        <img src="https://picsum.photos/300" alt="album">
    </div>

    <div class="song-info">
        <h3>Midnight Vibes</h3>
        <p>LoFi Artist</p>
    </div>

    <div class="progress-bar">
        <div class="progress"></div>
    </div>

    <div class="controls">
        <button>⏮</button>
        <button class="play">▶</button>
        <button>⏭</button>
    </div>

    <div class="playlist">
        <p>Dreamscape</p>
        <p>Night Drive</p>
        <p>Chill Beats</p>
        <p>Ocean Waves</p>
    </div>

</div>

</body>
</html>

body {
    margin: 0;
    height: 100vh;
    background: linear-gradient(135deg, #0f2027, #203a43, #2c5364);
    display: flex;
    justify-content: center;
    align-items: center;
    font-family: 'Segoe UI';
}

.music-app {
    width: 320px;
    padding: 20px;
    border-radius: 25px;
    background: rgba(255,255,255,0.05);
    backdrop-filter: blur(15px);
    box-shadow: 0 20px 40px rgba(0,0,0,0.5);
    text-align: center;
    color: white;
}

/* Header */
.header h2 {
    margin-bottom: 15px;
    letter-spacing: 2px;
}

/* Album */
.album img {
    width: 220px;
    border-radius: 20px;
    transition: 0.4s;
}

.album img:hover {
    transform: scale(1.05) rotate(2deg);
    box-shadow: 0 0 25px #00c6ff;
}

/* Song Info */
.song-info h3 {
    margin: 10px 0 5px;
}

.song-info p {
    color: #ccc;
}

/* Progress */
.progress-bar {
    width: 100%;
    height: 6px;
    background: #444;
    border-radius: 10px;
    margin: 15px 0;
    overflow: hidden;
}

.progress {
    width: 60%;
    height: 100%;
    background: linear-gradient(90deg, #00c6ff, #0072ff);
    animation: move 5s linear infinite;
}

@keyframes move {
    from { width: 0; }
    to { width: 100%; }
}

/* Controls */
.controls {
    display: flex;
    justify-content: space-around;
    margin: 15px 0;
}

.controls button {
    background: none;
    border: none;
    color: white;
    font-size: 22px;
    cursor: pointer;
    transition: 0.3s;
}

.controls button:hover {
    transform: scale(1.3);
    color: #00c6ff;
}

.play {
    font-size: 28px;
}

/* Playlist */
.playlist p {
    padding: 8px;
    margin: 5px 0;
    border-radius: 10px;
    transition: 0.3s;
    cursor: pointer;
}

.playlist p:hover {
    background: rgba(255,255,255,0.1);
    transform: translateX(10px);
    color: #00c6ff;
      }



<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Advanced Music UI</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<div class="app">

    <!-- Sidebar -->
    <div class="sidebar">
        <h2>🎵 Music</h2>
        <p>Home</p>
        <p>Library</p>
        <p>Favorites</p>
        <p>Settings</p>
    </div>

    <!-- Main Player -->
    <div class="player">

        <div class="album">
            <img src="https://picsum.photos/300">
        </div>

        <h3>Neon Nights</h3>
        <p>DJ Synthwave</p>

        <!-- Equalizer -->
        <div class="equalizer">
            <span></span><span></span><span></span><span></span>
        </div>

        <!-- Progress -->
        <div class="progress-bar">
            <div class="progress"></div>
        </div>

        <!-- Controls -->
        <div class="controls">
            <button>⏮</button>
            <button class="play">▶</button>
            <button>⏭</button>
        </div>

        <!-- Like Button -->
        <label class="like">
            <input type="checkbox">
            ❤️
        </label>

        <!-- Volume -->
        <input type="range" class="volume">

        <!-- Playlist -->
        <div class="playlist">
            <div class="active">Neon Nights</div>
            <div>Chill Wave</div>
            <div>Space Dreams</div>
            <div>Cyber Flow</div>
        </div>

    </div>

</div>

</body>
</html>

body {
    margin: 0;
    font-family: 'Segoe UI';
    background: radial-gradient(circle, #0f2027, #000);
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    overflow: hidden;
}

/* Glow Background */
body::before {
    content: "";
    position: absolute;
    width: 500px;
    height: 500px;
    background: radial-gradient(circle, #00c6ff, transparent);
    animation: glow 6s infinite alternate;
}

@keyframes glow {
    from { transform: translate(-50px, -50px); }
    to { transform: translate(50px, 50px); }
}

.app {
    display: flex;
    width: 700px;
    height: 420px;
    backdrop-filter: blur(20px);
}

/* Sidebar */
.sidebar {
    width: 150px;
    background: rgba(255,255,255,0.05);
    padding: 20px;
    color: white;
    border-radius: 20px 0 0 20px;
}

.sidebar p {
    margin: 15px 0;
    cursor: pointer;
    transition: 0.3s;
}

.sidebar p:hover {
    color: #00c6ff;
    transform: translateX(5px);
}

/* Player */
.player {
    flex: 1;
    background: rgba(255,255,255,0.05);
    padding: 20px;
    text-align: center;
    color: white;
    border-radius: 0 20px 20px 0;
}

/* Album */
.album img {
    width: 180px;
    border-radius: 50%;
    animation: rotate 10s linear infinite;
}

@keyframes rotate {
    from { transform: rotate(0); }
    to { transform: rotate(360deg); }
}

/* Equalizer */
.equalizer {
    display: flex;
    justify-content: center;
    margin: 10px 0;
}

.equalizer span {
    width: 5px;
    height: 20px;
    margin: 0 3px;
    background: #00c6ff;
    animation: bounce 1s infinite;
}

.equalizer span:nth-child(2) { animation-delay: .2s; }
.equalizer span:nth-child(3) { animation-delay: .4s; }
.equalizer span:nth-child(4) { animation-delay: .6s; }

@keyframes bounce {
    0%,100% { height: 10px; }
    50% { height: 25px; }
}

/* Progress */
.progress-bar {
    width: 100%;
    height: 5px;
    background: #333;
    border-radius: 10px;
    margin: 15px 0;
}

.progress {
    width: 70%;
    height: 100%;
    background: #00c6ff;
}

/* Controls */
.controls button {
    background: none;
    border: none;
    color: white;
    font-size: 20px;
    margin: 0 10px;
    cursor: pointer;
    transition: 0.3s;
}

.controls button:hover {
    color: #00c6ff;
    transform: scale(1.2);
}

/* Like Button */
.like input {
    display: none;
}

.like {
    font-size: 24px;
    cursor: pointer;
}

.like input:checked + * {
    color: red;
}

/* Volume */
.volume {
    width: 80%;
    margin: 10px 0;
}

/* Playlist */
.playlist div {
    padding: 8px;
    margin: 5px 0;
    border-radius: 10px;
    cursor: pointer;
    transition: 0.3s;
}

.playlist div:hover {
    background: rgba(255,255,255,0.1);
    transform: translateX(5px);
}

.playlist .active {
    background: #00c6ff;
    color: black;
                             }


/* =========================
   Large Screens (1200px+)
========================= */
@media (min-width: 1200px) {
    .app {
        width: 900px;
        height: 500px;
    }

    .album img {
        width: 220px;
    }
}

/* =========================
   Laptop / Desktop (992px)
========================= */
@media (max-width: 992px) {
    .app {
        width: 90%;
        height: auto;
        flex-direction: column;
    }

    .sidebar {
        width: 100%;
        display: flex;
        justify-content: space-around;
        border-radius: 20px 20px 0 0;
    }

    .sidebar p {
        margin: 10px;
        font-size: 14px;
    }

    .player {
        border-radius: 0 0 20px 20px;
    }
}

/* =========================
   Tablet (768px)
========================= */
@media (max-width: 768px) {
    .album img {
        width: 150px;
    }

    .controls button {
        font-size: 18px;
    }

    .equalizer span {
        width: 4px;
        height: 15px;
    }

    .playlist div {
        font-size: 14px;
        padding: 6px;
    }
}

/* =========================
   Mobile (576px)
========================= */
@media (max-width: 576px) {
    body {
        padding: 10px;
    }

    .app {
        width: 100%;
        height: auto;
    }

    .sidebar {
        flex-wrap: wrap;
        text-align: center;
    }

    .sidebar p {
        flex: 1 1 45%;
        font-size: 12px;
    }

    .album img {
        width: 120px;
    }

    .controls button {
        font-size: 16px;
    }

    .volume {
        width: 100%;
    }

    .playlist div {
        font-size: 12px;
    }
}

/* =========================
   Small Phones (400px)
========================= */
@media (max-width: 400px) {
    .album img {
        width: 100px;
    }

    .controls {
        flex-direction: column;
        gap: 10px;
    }

    .controls button {
        font-size: 14px;
    }

    .equalizer span {
        height: 12px;
    }

    .sidebar p {
        font-size: 11px;
    }
}


*Forged an immersive ludic interface where progression and point accrual are inextricably tied to the flawless transcription of dynamically presented textual constructs.*
