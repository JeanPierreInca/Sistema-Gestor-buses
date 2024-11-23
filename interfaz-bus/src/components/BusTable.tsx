import React, { useState, useEffect } from 'react';
import Pagination from './pagination'; // Importa el componente de paginación
import { Bus } from '../types/types';

const BusTable: React.FC = () => {
  const [buses, setBuses] = useState<Bus[]>([]);
  const [currentPage, setCurrentPage] = useState(1); // Página actual
  const [busesPerPage] = useState(5); // Número de buses por página


  // Fetching de datos
  useEffect(() => {
    fetch('http://localhost:8005/bus')
      .then((response) => {
        if (!response.ok) {
          throw new Error(`Error: ${response.status}`);
        }
        return response.json();
      })
      .then((data) => setBuses(data))
      .catch((error) => console.error('Error fetching buses:', error));
  }, []);


  // Calcular los datos de la página actual
  const indexOfLastBus = currentPage * busesPerPage;
  const indexOfFirstBus = indexOfLastBus - busesPerPage;
  const currentBuses = buses.slice(indexOfFirstBus, indexOfLastBus);

  // Cambiar la página
  const handlePageChange = (page: number) => {
    setCurrentPage(page);
  };

  return (
    <div className="container mt-4">
      <h2 className="text-center mb-4">Lista de Buses</h2>
      <table className="table table-striped table-hover table-bordered">
        <thead className="thead-dark">
          <tr>
            <th>ID</th>
            <th>Número de Bus</th>
            <th>Placa</th>
            <th>Fecha de Creación</th>
            <th>Características</th>
            <th>Marca</th>
            <th>Estado</th>
            <th>Detalles</th>
          </tr>
        </thead>
        <tbody>
          {currentBuses.map((bus) => (
            <tr key={bus.id}>
              <td>{bus.id}</td>
              <td>{bus.numeroBus}</td>
              <td>{bus.placa}</td>
              <td>{bus.fechaCreacion}</td>
              <td>{bus.caracteristicas}</td>
              <td>{bus.marca.nombre}</td>
              <td>{bus.activo ? 'Activo' : 'Inactivo'}</td>
              <td>
                <button
                  onClick={() =>
                    alert(`Detalles del Bus:\n${JSON.stringify(bus, null, 2)}`)
                  }
                  className="btn btn-primary btn-sm"
                >
                  Ver Detalles
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
       {/* Componente de Paginación */}
       <Pagination
        currentPage={currentPage}
        totalPages={Math.ceil(buses.length / busesPerPage)}
        onPageChange={handlePageChange}
      />
    </div>
  );
};

export default BusTable;