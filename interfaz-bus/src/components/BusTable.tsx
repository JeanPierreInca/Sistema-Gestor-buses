// src/components/BusTable.tsx
import React, { useState, useEffect } from 'react';
import { Bus } from '../types/types';

const BusTable: React.FC = () => {
  const [buses, setBuses] = useState<Bus[]>([]);

  // Fetching de datos
  useEffect(() => {
    fetch('http://localhost:8005/bus')
      .then(response => {
        if (!response.ok) {
          throw new Error(`Error: ${response.status}`);
        }
        return response.json();
      })
      .then(data => setBuses(data))
      .catch(error => console.error('Error fetching buses:', error));
  }, []);

  return (
    <div>
      <h2>Lista de Buses</h2>
      <table style={{ width: '100%', borderCollapse: 'collapse'}}>
        <thead>
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
          {buses.map(bus => (
            <tr
              key={bus.id}
             >
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
                  style={{
                    padding: '5px 10px',
                    cursor: 'pointer',
                    backgroundColor: '#007bff',
                    color: '#fff',
                    border: 'none',
                    borderRadius: '5px',
                    
                  }}
                >
                  Ver Detalles
                </button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default BusTable;
