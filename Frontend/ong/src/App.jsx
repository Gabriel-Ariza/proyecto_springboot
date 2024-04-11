import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import { HomePage } from './views/HomePage';
import Sedes from './views/Sede';
import Socios from './views/Socios';
import Voluntarios from './views/Voluntarios';
import Ayuda from './views/Ayuda';
import Informes from './views/Informes';

export function App() {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<HomePage />} />
                <Route path="/sede" element={<Sedes />} />
                <Route path="/socios" element={<Socios />} />
                <Route path="/voluntarios" element={<Voluntarios />} />
                <Route path="/ayuda" element={<Ayuda />} />
                <Route path="/informes" element={<Informes />} />
            </Routes>
        </Router>
    )
}