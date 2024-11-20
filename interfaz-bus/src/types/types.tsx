export interface Marca {
    id: number;
    nombre: string;
  }
  
  export interface Bus {
    id: number;
    numeroBus: string;
    placa: string;
    fechaCreacion: string;
    caracteristicas: string;
    marca: Marca;
    activo: boolean;
  }