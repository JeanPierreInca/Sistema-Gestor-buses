import React from 'react';

interface PaginationProps {
  currentPage: number;
  totalPages: number;
  onPageChange: (page: number) => void;
}

const Pagination: React.FC<PaginationProps> = ({
  currentPage,
  totalPages,
  onPageChange,
}) => {
  const pages = Array.from({ length: totalPages }, (_, i) => i + 1);

  return (
    <nav>
      <ul className="pagination justify-content-center">
        {pages.map(page => (
          <li
            key={page}
            className={`page-item ${page === currentPage ? 'active' : ''}`}
          >
            <button
              className="page-link"
              onClick={() => onPageChange(page)}
              disabled={page === currentPage}
            >
              {page}
            </button>
          </li>
        ))}
      </ul>
    </nav>
  );
};

export default Pagination