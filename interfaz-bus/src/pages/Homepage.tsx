// src/pages/HomePage.tsx
import React from 'react';
import BusTable from '../components/BusTable';

const HomePage: React.FC = () => {
  return (
    <div>
      <h1>Gestor de Buses</h1>
      <BusTable />
    </div>
  );
};

export default HomePage;
