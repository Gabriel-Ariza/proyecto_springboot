import { Link } from "react-router-dom";
import "../components/styles/juanchito.css";

export function HomePage() {
    return (
        <section className='padre'>
            <header className='header'>
                <div className='padre_titulos'>
                    <div className='parte1_titulo'>
                        <h1 className='titulo'>Bienvenido a nuestra ONG!</h1>
                    </div>

                    <div className='parte2_titulo'>
                        <div className='image'></div>
                    </div>
                </div>
            </header>

            <main className='main'>
                <p>contenido de la pag</p>
                <div className='padre_modulos'>
                    <Link to="/sede" className='modulo' id='sede'>
                        <h2>Sedes</h2>
                    </Link>
                    <Link to="/socios" className='modulo' id='socios'>
                        <h2>Socios</h2>
                    </Link>
                    <Link to="/voluntarios" className='modulo' id='voluntarios'>
                        <h2>Voluntarios</h2>
                    </Link>
                    <Link to="/ayuda" className='modulo' id='ayuda'>
                        <h2>Ayuda Humanitaria</h2>
                    </Link>
                    <Link to="/informes" className='modulo' id='informes'>
                        <h2>Informes</h2>
                    </Link>
                </div>
            </main>

            <footer className='footer'>
                <p>pie de pagina</p>
            </footer>
        </section>
    )
}