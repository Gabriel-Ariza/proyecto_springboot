import { useState } from 'react';
import '../components/styles/sede.css';
import sedesData from './ejemplo.json';

function Sede() {
    const [vista, setVista] = useState('');
    const sedes = sedesData;

    const manejarCrear = () => setVista('crear');
    const manejarActualizar = () => setVista('actualizar');
    const manejarEliminar = () => setVista('eliminar');
    const manejarListar = () => setVista('listar');

    return (
        <div className="padre">
            <div className='introduccion'>
                <div className='parte1_introduccion'>
                    <div className='logo'>
                        <div className='image_logo'></div>
                    </div>
                    <div className='tit'>
                        <h1>ONG</h1>
                        <p>Organización No Gubernamental</p>
                    </div>
                </div>
                <div className='parte2_introduccion'>
                    <a href="" id='unete'>Únete</a>
                    <a href="" id='dona'>Dona</a>
                    <i className="casita">
                        <svg xmlns="http://www.w3.org/2000/svg" height="24" viewBox="0 -960 960 960" width="24">
                            <path d="M240-200h120v-240h240v240h120v-360L480-740 240-560v360Zm-80 80v-480l320-240 320 240v480H520v-240h-80v240H160Zm320-350Z" fill="#FF895A" strokeWidth="0.5"/>
                        </svg>
                    </i>
                </div>
            </div>

            <div className='titulo'>
                    <h1><span>Gestion</span> Sedes</h1>
                </div>

            <main className='main'>
                <div className='intro-main'>
                    <h2>¿Qué es una sede?</h2>
                    <p>Una sede es un lugar físico donde se encuentran las oficinas de una organización.</p>
                </div>
                <div className='padre_botones'>
                    <div className='container_button'>
                        <button onClick={manejarCrear}>Crear Sede</button>
                    </div>
                    <div className='container_button'>
                        <button onClick={manejarActualizar}>Actualizar Sede</button>
                    </div>
                    <div className='container_button'>
                        <button onClick={manejarEliminar}>Eliminar Sede</button>
                    </div>
                    <div className='container_button'>
                        <button onClick={manejarListar}>Listar Sede</button>
                    </div>
                </div>
            </main>

            <section className='renderizado'>
                {vista === 'crear' && 
                    <div>Crear Sede</div>
                }

                {vista === 'actualizar' &&
                    <div>Actualizar Sede</div>
                }

                {vista === 'eliminar' &&
                    <div>Eliminar Sede</div>
                }

                {vista === 'listar' && 
                    <div className='padre_listas'>
                    {sedes.map(sede => (
                        <div key={sede.id} className="tarjeta">
                            <p>Ciudad: {sede.ciudad.nombre}</p>
                            <p>Dirección: {sede.direccion}</p>
                            <p>Director: {sede.director}</p>
                            <p>Id: {sede.id}</p>
                            <h2>Envíos: {sede.envios.length}</h2>
                        </div>
                    ))}
                </div>
                }
            </section>
        </div>
    )
}

export default Sede;