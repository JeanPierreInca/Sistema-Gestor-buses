import React from 'react';
import BusTable from './components/BusTable'; // Asegúrate de que la ruta de BusTable también sea correcta

const HomePage: React.FC = () => {
  return (
    <div>
      {/* <h1>Gestor de Buses</h1> */}
      <img src="/assets/images/civa.png" alt="civa" width="250" height="100" />
      <BusTable /> {/* Renderiza la tabla de buses */}
    </div>
  );
};

export default HomePage;

